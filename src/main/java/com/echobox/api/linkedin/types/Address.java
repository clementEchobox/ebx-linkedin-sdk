/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.echobox.api.linkedin.types;

import com.echobox.api.linkedin.jsonmapper.LinkedIn;

import lombok.Getter;

/**
 * Address model
 * @author Joanna
 *
 */
public class Address {
  
  /**
   * First line of street address of location.
   */
  @Getter
  @LinkedIn("street1")
  private String firstStreet;
  
  /**
   * Second line of street address of location.
   */
  @Getter
  @LinkedIn("street2")
  private String secondStreet;
  
  /**
   * City for location.
   */
  @Getter
  @LinkedIn
  private String city;
  
  /**
   * State for location.
   */
  @Getter
  @LinkedIn
  private String state;
  
  /**
   * Postal code for location. Matches companies within a specific postal code.
   * Must be combined with the country-code parameter. Not supported for all countries.
   */
  @Getter
  @LinkedIn
  private String postalCode;
  
  /**
   * Country code for location. Matches companies with a location in a specific country.
   */
  @Getter
  @LinkedIn
  private String countryCode;
  
  /**
   * Region code for location.
   */
  @Getter
  @LinkedIn
  private Integer regionCode;
}
