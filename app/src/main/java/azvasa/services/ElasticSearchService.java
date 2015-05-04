package azvasa.services;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.*;
import org.elasticsearch.index.query.FilterBuilders.*;
import org.elasticsearch.index.query.QueryBuilders.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import static org.elasticsearch.index.query.QueryBuilders.*;
import static org.elasticsearch.index.query.FilterBuilders.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class ElasticSearchService {

        private static Client client;

        private static Client getClient() {
                client = new TransportClient()
                        .addTransportAddress(new InetSocketTransportAddress("52.8.15.217", 9300));
                return client;
        }

        private static void closeClient() {
                client.close();
        }

        public static List<Map<String,Object>> searchLogsGreaterThan(String vmName, String lastSearchTimeStamp, String alarmMetric, int alarmThresholdValue, int limit) {
                List<Map<String,Object>> searchResult = new ArrayList<Map<String,Object>>();

                SearchResponse response = getClient().prepareSearch("logstash-*")
                        .setQuery(QueryBuilders.matchQuery("name", vmName))
                        .setPostFilter(FilterBuilders.rangeFilter("timestamp").from(lastSearchTimeStamp))
                        .setPostFilter(FilterBuilders.rangeFilter(alarmMetric).gt(alarmThresholdValue))
                        .setFrom(0).setSize(limit).setExplain(true)
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

        public static List<Map<String, Object>> searchLogsLesserThan(String vmName, String lastSearchTimeStamp, String alarmMetric, int thresholdValue, int limit) {
                List<Map<String,Object>> searchResult = new ArrayList<Map<String,Object>>();

                SearchResponse response = getClient().prepareSearch("logstash-*")
                        .setQuery(QueryBuilders.matchQuery("name", vmName))
                        .setPostFilter(FilterBuilders.rangeFilter("timestamp").from(lastSearchTimeStamp))
                        .setPostFilter(FilterBuilders.rangeFilter(alarmMetric).lt(thresholdValue))
                        .setFrom(0).setSize(limit).setExplain(true)
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