
package api.ovs.oracle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import api.ovs.oracle.types.AddMembersElement;
import api.ovs.oracle.types.AddMembersResponseElement;
import api.ovs.oracle.types.BlackoutServerElement;
import api.ovs.oracle.types.BlackoutServerResponseElement;
import api.ovs.oracle.types.CheckHAAbility4ServerPoolByIdElement;
import api.ovs.oracle.types.CheckHAAbility4ServerPoolByIdResponseElement;
import api.ovs.oracle.types.CheckServerConnectionElement;
import api.ovs.oracle.types.CheckServerConnectionResponseElement;
import api.ovs.oracle.types.CheckVirtualServerCompatibilityElement;
import api.ovs.oracle.types.CheckVirtualServerCompatibilityResponseElement;
import api.ovs.oracle.types.CreateServerPoolElement;
import api.ovs.oracle.types.CreateServerPoolResponseElement;
import api.ovs.oracle.types.DeleteServerPoolElement;
import api.ovs.oracle.types.DeleteServerPoolResponseElement;
import api.ovs.oracle.types.EndBlackoutServerElement;
import api.ovs.oracle.types.EndBlackoutServerResponseElement;
import api.ovs.oracle.types.GetAgentVersionElement;
import api.ovs.oracle.types.GetAgentVersionResponseElement;
import api.ovs.oracle.types.GetAllHVMServerPoolsByUserIdElement;
import api.ovs.oracle.types.GetAllHVMServerPoolsByUserIdResponseElement;
import api.ovs.oracle.types.GetAllHVMServerPoolsElement;
import api.ovs.oracle.types.GetAllHVMServerPoolsResponseElement;
import api.ovs.oracle.types.GetAllMembersElement;
import api.ovs.oracle.types.GetAllMembersResponseElement;
import api.ovs.oracle.types.GetAllServerPoolsElement;
import api.ovs.oracle.types.GetAllServerPoolsResponseElement;
import api.ovs.oracle.types.GetClusterRootByServerPoolIdElement;
import api.ovs.oracle.types.GetClusterRootByServerPoolIdResponseElement;
import api.ovs.oracle.types.GetMasterAgentStatusElement;
import api.ovs.oracle.types.GetMasterAgentStatusResponseElement;
import api.ovs.oracle.types.GetMasterServerElement;
import api.ovs.oracle.types.GetMasterServerResponseElement;
import api.ovs.oracle.types.GetMinSupportedOVSAgentVersionElement;
import api.ovs.oracle.types.GetMinSupportedOVSAgentVersionResponseElement;
import api.ovs.oracle.types.GetMinimumAgentVersionElement;
import api.ovs.oracle.types.GetMinimumAgentVersionResponseElement;
import api.ovs.oracle.types.GetNetworkBridgesByServerIPElement;
import api.ovs.oracle.types.GetNetworkBridgesByServerIPResponseElement;
import api.ovs.oracle.types.GetNetworkBridgesElement;
import api.ovs.oracle.types.GetNetworkBridgesResponseElement;
import api.ovs.oracle.types.GetServerByNameElement;
import api.ovs.oracle.types.GetServerByNameResponseElement;
import api.ovs.oracle.types.GetServerElement;
import api.ovs.oracle.types.GetServerPoolByIdElement;
import api.ovs.oracle.types.GetServerPoolByIdResponseElement;
import api.ovs.oracle.types.GetServerPoolByNameElement;
import api.ovs.oracle.types.GetServerPoolByNameResponseElement;
import api.ovs.oracle.types.GetServerPoolElement;
import api.ovs.oracle.types.GetServerPoolMetricsByServerPoolIdElement;
import api.ovs.oracle.types.GetServerPoolMetricsByServerPoolIdResponseElement;
import api.ovs.oracle.types.GetServerPoolResponseElement;
import api.ovs.oracle.types.GetServerPoolsElement;
import api.ovs.oracle.types.GetServerPoolsResponseElement;
import api.ovs.oracle.types.GetServerResponseElement;
import api.ovs.oracle.types.GetStorageRepositoriesByServerPoolIdElement;
import api.ovs.oracle.types.GetStorageRepositoriesByServerPoolIdResponseElement;
import api.ovs.oracle.types.GetVirtualServerByIdElement;
import api.ovs.oracle.types.GetVirtualServerByIdResponseElement;
import api.ovs.oracle.types.GetVirtualServerByNameElement;
import api.ovs.oracle.types.GetVirtualServerByNameResponseElement;
import api.ovs.oracle.types.GetVirtualServerByServerPoolElement;
import api.ovs.oracle.types.GetVirtualServerByServerPoolResponseElement;
import api.ovs.oracle.types.GetVirtualServerMetricsElement;
import api.ovs.oracle.types.GetVirtualServerMetricsResponseElement;
import api.ovs.oracle.types.GetVirtualServersElement;
import api.ovs.oracle.types.GetVirtualServersResponseElement;
import api.ovs.oracle.types.RebootServerElement;
import api.ovs.oracle.types.RebootServerResponseElement;
import api.ovs.oracle.types.RefreshServerPoolElement;
import api.ovs.oracle.types.RefreshServerPoolResponseElement;
import api.ovs.oracle.types.RemoveMemberElement;
import api.ovs.oracle.types.RemoveMemberResponseElement;
import api.ovs.oracle.types.RestoreVirtualServerPoolByManagerDataElement;
import api.ovs.oracle.types.RestoreVirtualServerPoolByManagerDataResponseElement;
import api.ovs.oracle.types.ShutdownServerElement;
import api.ovs.oracle.types.ShutdownServerResponseElement;
import api.ovs.oracle.types.UpdateServerPool2Element;
import api.ovs.oracle.types.UpdateServerPool2ResponseElement;
import api.ovs.oracle.types.UpdateServerPoolElement;
import api.ovs.oracle.types.UpdateServerPoolResponseElement;
import api.ovs.oracle.types.UpdateUserList4ServerPoolElement;
import api.ovs.oracle.types.UpdateUserList4ServerPoolResponseElement;
import api.ovs.oracle.types.UpdateUtilityServerPasswordElement;
import api.ovs.oracle.types.UpdateUtilityServerPasswordResponseElement;
import api.ovs.oracle.types.UpdateVirtualServerAgentPasswordElement;
import api.ovs.oracle.types.UpdateVirtualServerAgentPasswordResponseElement;
import api.ovs.oracle.types.UpdateVirtualServerByIdElement;
import api.ovs.oracle.types.UpdateVirtualServerByIdResponseElement;
import api.ovs.oracle.types.UpdateVirtualServerElement;
import api.ovs.oracle.types.UpdateVirtualServerResponseElement;
import api.ovs.oracle.types.ValidateAddMembersElement;
import api.ovs.oracle.types.ValidateAddMembersResponseElement;
import api.ovs.oracle.types.ValidateBlackoutServerElement;
import api.ovs.oracle.types.ValidateBlackoutServerResponseElement;
import api.ovs.oracle.types.ValidateCreateServerPoolElement;
import api.ovs.oracle.types.ValidateCreateServerPoolResponseElement;
import api.ovs.oracle.types.ValidateDeleteServerPoolElement;
import api.ovs.oracle.types.ValidateDeleteServerPoolResponseElement;
import api.ovs.oracle.types.ValidateRebootServerElement;
import api.ovs.oracle.types.ValidateRebootServerResponseElement;
import api.ovs.oracle.types.ValidateRemoveMemberElement;
import api.ovs.oracle.types.ValidateRemoveMemberResponseElement;
import api.ovs.oracle.types.ValidateShutdownServerElement;
import api.ovs.oracle.types.ValidateShutdownServerResponseElement;
import api.ovs.oracle.types.ValidateUpdateUtilityServerPasswordElement;
import api.ovs.oracle.types.ValidateUpdateUtilityServerPasswordResponseElement;
import api.ovs.oracle.types.ValidateUpdateVSAgentPasswordElement;
import api.ovs.oracle.types.ValidateUpdateVSAgentPasswordResponseElement;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ServerPoolService", targetNamespace = "http://oracle.ovs.api/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    api.ovs.oracle.types.ObjectFactory.class,
    com.oracle.webservices.internal.literal.ObjectFactory.class
})
public interface ServerPoolService {


    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.AddMembersResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//addMembers")
    @WebResult(name = "addMembersResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public AddMembersResponseElement addMembers(
        @WebParam(name = "addMembersElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        AddMembersElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.BlackoutServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//blackoutServer")
    @WebResult(name = "blackoutServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public BlackoutServerResponseElement blackoutServer(
        @WebParam(name = "blackoutServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        BlackoutServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.CheckHAAbility4ServerPoolByIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//checkHAAbility4ServerPoolById")
    @WebResult(name = "checkHAAbility4ServerPoolByIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public CheckHAAbility4ServerPoolByIdResponseElement checkHAAbility4ServerPoolById(
        @WebParam(name = "checkHAAbility4ServerPoolByIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        CheckHAAbility4ServerPoolByIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.CheckServerConnectionResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//checkServerConnection")
    @WebResult(name = "checkServerConnectionResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public CheckServerConnectionResponseElement checkServerConnection(
        @WebParam(name = "checkServerConnectionElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        CheckServerConnectionElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.CheckVirtualServerCompatibilityResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//checkVirtualServerCompatibility")
    @WebResult(name = "checkVirtualServerCompatibilityResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public CheckVirtualServerCompatibilityResponseElement checkVirtualServerCompatibility(
        @WebParam(name = "checkVirtualServerCompatibilityElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        CheckVirtualServerCompatibilityElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.CreateServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//createServerPool")
    @WebResult(name = "createServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public CreateServerPoolResponseElement createServerPool(
        @WebParam(name = "createServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        CreateServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.DeleteServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//deleteServerPool")
    @WebResult(name = "deleteServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public DeleteServerPoolResponseElement deleteServerPool(
        @WebParam(name = "deleteServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        DeleteServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.EndBlackoutServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//endBlackoutServer")
    @WebResult(name = "endBlackoutServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public EndBlackoutServerResponseElement endBlackoutServer(
        @WebParam(name = "endBlackoutServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        EndBlackoutServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetAgentVersionResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getAgentVersion")
    @WebResult(name = "getAgentVersionResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetAgentVersionResponseElement getAgentVersion(
        @WebParam(name = "getAgentVersionElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetAgentVersionElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetAllHVMServerPoolsResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getAllHVMServerPools")
    @WebResult(name = "getAllHVMServerPoolsResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetAllHVMServerPoolsResponseElement getAllHVMServerPools(
        @WebParam(name = "getAllHVMServerPoolsElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetAllHVMServerPoolsElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetAllHVMServerPoolsByUserIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getAllHVMServerPoolsByUserId")
    @WebResult(name = "getAllHVMServerPoolsByUserIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetAllHVMServerPoolsByUserIdResponseElement getAllHVMServerPoolsByUserId(
        @WebParam(name = "getAllHVMServerPoolsByUserIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetAllHVMServerPoolsByUserIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetAllMembersResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getAllMembers")
    @WebResult(name = "getAllMembersResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetAllMembersResponseElement getAllMembers(
        @WebParam(name = "getAllMembersElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetAllMembersElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetAllServerPoolsResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getAllServerPools")
    @WebResult(name = "getAllServerPoolsResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetAllServerPoolsResponseElement getAllServerPools(
        @WebParam(name = "getAllServerPoolsElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetAllServerPoolsElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetClusterRootByServerPoolIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getClusterRootByServerPoolId")
    @WebResult(name = "getClusterRootByServerPoolIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetClusterRootByServerPoolIdResponseElement getClusterRootByServerPoolId(
        @WebParam(name = "getClusterRootByServerPoolIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetClusterRootByServerPoolIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetMasterAgentStatusResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getMasterAgentStatus")
    @WebResult(name = "getMasterAgentStatusResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetMasterAgentStatusResponseElement getMasterAgentStatus(
        @WebParam(name = "getMasterAgentStatusElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetMasterAgentStatusElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetMasterServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getMasterServer")
    @WebResult(name = "getMasterServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetMasterServerResponseElement getMasterServer(
        @WebParam(name = "getMasterServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetMasterServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetMinSupportedOVSAgentVersionResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getMinSupportedOVSAgentVersion")
    @WebResult(name = "getMinSupportedOVSAgentVersionResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetMinSupportedOVSAgentVersionResponseElement getMinSupportedOVSAgentVersion(
        @WebParam(name = "getMinSupportedOVSAgentVersionElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetMinSupportedOVSAgentVersionElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetMinimumAgentVersionResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getMinimumAgentVersion")
    @WebResult(name = "getMinimumAgentVersionResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetMinimumAgentVersionResponseElement getMinimumAgentVersion(
        @WebParam(name = "getMinimumAgentVersionElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetMinimumAgentVersionElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetNetworkBridgesResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getNetworkBridges")
    @WebResult(name = "getNetworkBridgesResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetNetworkBridgesResponseElement getNetworkBridges(
        @WebParam(name = "getNetworkBridgesElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetNetworkBridgesElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetNetworkBridgesByServerIPResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getNetworkBridgesByServerIP")
    @WebResult(name = "getNetworkBridgesByServerIPResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetNetworkBridgesByServerIPResponseElement getNetworkBridgesByServerIP(
        @WebParam(name = "getNetworkBridgesByServerIPElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetNetworkBridgesByServerIPElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServer")
    @WebResult(name = "getServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerResponseElement getServer(
        @WebParam(name = "getServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerByNameResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServerByName")
    @WebResult(name = "getServerByNameResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerByNameResponseElement getServerByName(
        @WebParam(name = "getServerByNameElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerByNameElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServerPool")
    @WebResult(name = "getServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerPoolResponseElement getServerPool(
        @WebParam(name = "getServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerPoolByIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServerPoolById")
    @WebResult(name = "getServerPoolByIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerPoolByIdResponseElement getServerPoolById(
        @WebParam(name = "getServerPoolByIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerPoolByIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerPoolByNameResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServerPoolByName")
    @WebResult(name = "getServerPoolByNameResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerPoolByNameResponseElement getServerPoolByName(
        @WebParam(name = "getServerPoolByNameElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerPoolByNameElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerPoolMetricsByServerPoolIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServerPoolMetricsByServerPoolId")
    @WebResult(name = "getServerPoolMetricsByServerPoolIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerPoolMetricsByServerPoolIdResponseElement getServerPoolMetricsByServerPoolId(
        @WebParam(name = "getServerPoolMetricsByServerPoolIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerPoolMetricsByServerPoolIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetServerPoolsResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getServerPools")
    @WebResult(name = "getServerPoolsResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetServerPoolsResponseElement getServerPools(
        @WebParam(name = "getServerPoolsElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetServerPoolsElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetStorageRepositoriesByServerPoolIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getStorageRepositoriesByServerPoolId")
    @WebResult(name = "getStorageRepositoriesByServerPoolIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetStorageRepositoriesByServerPoolIdResponseElement getStorageRepositoriesByServerPoolId(
        @WebParam(name = "getStorageRepositoriesByServerPoolIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetStorageRepositoriesByServerPoolIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetVirtualServerByIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getVirtualServerById")
    @WebResult(name = "getVirtualServerByIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetVirtualServerByIdResponseElement getVirtualServerById(
        @WebParam(name = "getVirtualServerByIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetVirtualServerByIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetVirtualServerByNameResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getVirtualServerByName")
    @WebResult(name = "getVirtualServerByNameResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetVirtualServerByNameResponseElement getVirtualServerByName(
        @WebParam(name = "getVirtualServerByNameElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetVirtualServerByNameElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetVirtualServerByServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getVirtualServerByServerPool")
    @WebResult(name = "getVirtualServerByServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetVirtualServerByServerPoolResponseElement getVirtualServerByServerPool(
        @WebParam(name = "getVirtualServerByServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetVirtualServerByServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetVirtualServerMetricsResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getVirtualServerMetrics")
    @WebResult(name = "getVirtualServerMetricsResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetVirtualServerMetricsResponseElement getVirtualServerMetrics(
        @WebParam(name = "getVirtualServerMetricsElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetVirtualServerMetricsElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.GetVirtualServersResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//getVirtualServers")
    @WebResult(name = "getVirtualServersResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public GetVirtualServersResponseElement getVirtualServers(
        @WebParam(name = "getVirtualServersElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        GetVirtualServersElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.RebootServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//rebootServer")
    @WebResult(name = "rebootServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public RebootServerResponseElement rebootServer(
        @WebParam(name = "rebootServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        RebootServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.RefreshServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//refreshServerPool")
    @WebResult(name = "refreshServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public RefreshServerPoolResponseElement refreshServerPool(
        @WebParam(name = "refreshServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        RefreshServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.RemoveMemberResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//removeMember")
    @WebResult(name = "removeMemberResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public RemoveMemberResponseElement removeMember(
        @WebParam(name = "removeMemberElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        RemoveMemberElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.RestoreVirtualServerPoolByManagerDataResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//restoreVirtualServerPoolByManagerData")
    @WebResult(name = "restoreVirtualServerPoolByManagerDataResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public RestoreVirtualServerPoolByManagerDataResponseElement restoreVirtualServerPoolByManagerData(
        @WebParam(name = "restoreVirtualServerPoolByManagerDataElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        RestoreVirtualServerPoolByManagerDataElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ShutdownServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//shutdownServer")
    @WebResult(name = "shutdownServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ShutdownServerResponseElement shutdownServer(
        @WebParam(name = "shutdownServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ShutdownServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateServerPool")
    @WebResult(name = "updateServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateServerPoolResponseElement updateServerPool(
        @WebParam(name = "updateServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateServerPool2ResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateServerPool2")
    @WebResult(name = "updateServerPool2ResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateServerPool2ResponseElement updateServerPool2(
        @WebParam(name = "updateServerPool2Element", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateServerPool2Element parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateUserList4ServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateUserList4ServerPool")
    @WebResult(name = "updateUserList4ServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateUserList4ServerPoolResponseElement updateUserList4ServerPool(
        @WebParam(name = "updateUserList4ServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateUserList4ServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateUtilityServerPasswordResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateUtilityServerPassword")
    @WebResult(name = "updateUtilityServerPasswordResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateUtilityServerPasswordResponseElement updateUtilityServerPassword(
        @WebParam(name = "updateUtilityServerPasswordElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateUtilityServerPasswordElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateVirtualServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateVirtualServer")
    @WebResult(name = "updateVirtualServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateVirtualServerResponseElement updateVirtualServer(
        @WebParam(name = "updateVirtualServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateVirtualServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateVirtualServerAgentPasswordResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateVirtualServerAgentPassword")
    @WebResult(name = "updateVirtualServerAgentPasswordResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateVirtualServerAgentPasswordResponseElement updateVirtualServerAgentPassword(
        @WebParam(name = "updateVirtualServerAgentPasswordElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateVirtualServerAgentPasswordElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.UpdateVirtualServerByIdResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//updateVirtualServerById")
    @WebResult(name = "updateVirtualServerByIdResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public UpdateVirtualServerByIdResponseElement updateVirtualServerById(
        @WebParam(name = "updateVirtualServerByIdElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        UpdateVirtualServerByIdElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateAddMembersResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateAddMembers")
    @WebResult(name = "validateAddMembersResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateAddMembersResponseElement validateAddMembers(
        @WebParam(name = "validateAddMembersElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateAddMembersElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateBlackoutServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateBlackoutServer")
    @WebResult(name = "validateBlackoutServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateBlackoutServerResponseElement validateBlackoutServer(
        @WebParam(name = "validateBlackoutServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateBlackoutServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateCreateServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateCreateServerPool")
    @WebResult(name = "validateCreateServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateCreateServerPoolResponseElement validateCreateServerPool(
        @WebParam(name = "validateCreateServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateCreateServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateDeleteServerPoolResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateDeleteServerPool")
    @WebResult(name = "validateDeleteServerPoolResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateDeleteServerPoolResponseElement validateDeleteServerPool(
        @WebParam(name = "validateDeleteServerPoolElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateDeleteServerPoolElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateRebootServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateRebootServer")
    @WebResult(name = "validateRebootServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateRebootServerResponseElement validateRebootServer(
        @WebParam(name = "validateRebootServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateRebootServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateRemoveMemberResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateRemoveMember")
    @WebResult(name = "validateRemoveMemberResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateRemoveMemberResponseElement validateRemoveMember(
        @WebParam(name = "validateRemoveMemberElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateRemoveMemberElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateShutdownServerResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateShutdownServer")
    @WebResult(name = "validateShutdownServerResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateShutdownServerResponseElement validateShutdownServer(
        @WebParam(name = "validateShutdownServerElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateShutdownServerElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateUpdateUtilityServerPasswordResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateUpdateUtilityServerPassword")
    @WebResult(name = "validateUpdateUtilityServerPasswordResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateUpdateUtilityServerPasswordResponseElement validateUpdateUtilityServerPassword(
        @WebParam(name = "validateUpdateUtilityServerPasswordElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateUpdateUtilityServerPasswordElement parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns api.ovs.oracle.types.ValidateUpdateVSAgentPasswordResponseElement
     */
    @WebMethod(action = "http://oracle.ovs.api//validateUpdateVSAgentPassword")
    @WebResult(name = "validateUpdateVSAgentPasswordResponseElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
    public ValidateUpdateVSAgentPasswordResponseElement validateUpdateVSAgentPassword(
        @WebParam(name = "validateUpdateVSAgentPasswordElement", targetNamespace = "http://oracle.ovs.api/types/", partName = "parameters")
        ValidateUpdateVSAgentPasswordElement parameters);

}
