package azvasa.services;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.FilterBuilders.*;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryBuilders.*;
import org.elasticsearch.search.SearchHit;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class ElasticSearchService {

private static Client client;
//private static String lastSearchTimeStamp = "2015-04-26T02:58:00Z";

private static Client getClient() {
        client = new TransportClient()
        .addTransportAddress(new InetSocketTransportAddress("52.8.15.217", 9300));
        return client;
        }

private static void closeClient() {
        client.close();
        }

public static List<Map<String,Object>> searchLogs(String vmName , Long  lastSearchTimeStamp , String alarmMetric ,String alarmThresholdValue) {
        System.out.println(vmName);
        System.out.println("Timestamp1 "+lastSearchTimeStamp);
        System.out.println("In Elastic search ...");
        List<Map<String,Object>> searchResult = new ArrayList<Map<String,Object>>();

        SearchResponse response = getClient().prepareSearch("logstash-*")
        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
        .setQuery(QueryBuilders.matchQuery("name", vmName))
        .setPostFilter(FilterBuilders.rangeFilter("timestamp").from(lastSearchTimeStamp))
        .setFrom(0).setSize(5).setExplain(true)
        .execute()
        .actionGet();

        SearchHit[] results = response.getHits().getHits();

        for (SearchHit hit : results) {
            System.out.println(hit.getSource());
            searchResult.add(hit.getSource());
        }

        closeClient();

        return searchResult;

        }
}
