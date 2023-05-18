/*
 * Copyright contributors to the Galasa project 
 */
package dev.galasa.framework.api.ras.internal.commons;

public enum ServletErrorMessage {

    // RunQuery...
    GAL5001_INVALID_DATE_TIME_FIELD                 (5001,"E: Error parsing the date-time field ''{0}'' in the request URL. Invalid value ''{1}''. Expecting a java LocalDateTime format. For example: ''2023-04-11T09:42:06.589180Z''"),
    GAL5002_INVALID_RUN_ID                          (5002,"E: Error retrieving ras run from identifier ''{0}''."),
    GAL5003_ERROR_RETRIEVING_RUNS                   (5003,"E: Error retrieving runs. Report the problem to your Galasa Ecosystem owner."),
    GAL5004_ERROR_RETRIEVING_PAGE                   (5004,"E: Error retrieving page. Report the problem to your Galasa Ecosystem owner."),
    GAL5005_INVALID_QUERY_PARAM_NOT_INTEGER         (5005,"E: Error parsing the query parameter ''{0}'' in the request URL. Invalid value ''{1}''. Expecting an integer."),
    GAL5006_INVALID_QUERY_PARAM_DUPLICATES          (5006,"E: Error parsing the query parameters. Duplicate instances of query parameter ''{0}'' found in the request URL. Expecting only one."),

    GAL5010_FROM_DATE_IS_REQUIRED                   (5010,"E: Error parsing the query parameters. from time is a mandatory field if no runname is supplied."),    
    
    // RunArtifactsList...
    GAL5007_ERROR_RETRIEVING_ARTIFACTS_LIST         (5007,"E: Error retrieving artifacts for run with identifier ''{0}''."),

    // RunArtifactsDownload...
    GAL5008_ERROR_LOCATING_ARTIFACT                 (5008,"E: Error locating artifact ''{0}'' for run with identifier ''{1}''."),
    GAL5009_ERROR_RETRIEVING_ARTIFACT               (5009,"E: Error retrieving artifact ''{0}'' for run with identifier ''{1}''."),

    // GenericErrors...
    GAL5000_GENERIC_API_ERROR                       (5000,"E: Error occured when trying to access the endpoint. Report the problem to your Galasa Ecosystem owner."),
    GAL5404_UNRESOLVED_ENDPOINT_ERROR               (5404,"E: Error occured when trying to identify the endpoint ''{0}''. Please check your endpoint URL or report the problem to your Galasa Ecosystem owner."),

    ;


    private String template ;
    private int templateNumber;

    private ServletErrorMessage(int templateNumber , String template) {
        this.template = "GAL"+Integer.toString(templateNumber)+template ;
        this.templateNumber = templateNumber ;
    }

    public String toString() {
        return this.template ;
    }

    public int getTemplateNumber() {
        return this.templateNumber;
    }

}