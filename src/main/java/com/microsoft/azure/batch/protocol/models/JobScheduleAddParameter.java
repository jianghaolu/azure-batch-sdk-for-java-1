/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A job schedule that allows recurring jobs by specifying when to run jobs and
 * a specification used to create each job.
 */
public class JobScheduleAddParameter {
    /**
     * A string that uniquely identifies the schedule within the account.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores, and cannot contain more than 64 characters. The
     * id is case-preserving and case-insensitive (that is, you may not have
     * two ids within an account that differ only by case).
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The display name for the schedule.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The schedule according to which jobs will be created.
     */
    @JsonProperty(value = "schedule", required = true)
    private Schedule schedule;

    /**
     * The details of the jobs to be created on this schedule.
     */
    @JsonProperty(value = "jobSpecification", required = true)
    private JobSpecification jobSpecification;

    /**
     * A list of name-value pairs associated with the schedule as metadata.
     * The Batch service does not assign any meaning to metadata; it is solely
     * for the use of user code.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the JobScheduleAddParameter object itself.
     */
    public JobScheduleAddParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the JobScheduleAddParameter object itself.
     */
    public JobScheduleAddParameter withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the schedule value.
     *
     * @return the schedule value
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule value.
     *
     * @param schedule the schedule value to set
     * @return the JobScheduleAddParameter object itself.
     */
    public JobScheduleAddParameter withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the jobSpecification value.
     *
     * @return the jobSpecification value
     */
    public JobSpecification jobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Set the jobSpecification value.
     *
     * @param jobSpecification the jobSpecification value to set
     * @return the JobScheduleAddParameter object itself.
     */
    public JobScheduleAddParameter withJobSpecification(JobSpecification jobSpecification) {
        this.jobSpecification = jobSpecification;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the JobScheduleAddParameter object itself.
     */
    public JobScheduleAddParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
