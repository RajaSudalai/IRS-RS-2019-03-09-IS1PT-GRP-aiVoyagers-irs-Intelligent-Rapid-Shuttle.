package com.irsspace.irs_rs_2019_01_19_is1pt_grp_aivoyagers_irs_intelligent_rapid_shuttle;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("RouteNode")
@org.kie.api.definition.type.Description("RouteNode - Equivalent of Standstill")
public interface Standstill {

    /**
     * @return never null
     */
    Location getLocation();

    /**
     * @return sometimes null
     */
    Vehicle getVehicle();

    /**
     * @return sometimes null
     */
 //   @InverseRelationShadowVariable(sourceVariableName = "previousStandstill")
    Customer getNextCustomer();
    void setNextCustomer(Customer nextCustomer);

}
