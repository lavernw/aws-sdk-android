/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Provisioned Capacity Request Marshaller
 */
public class DescribeProvisionedCapacityRequestMarshaller implements Marshaller<Request<DescribeProvisionedCapacityRequest>, DescribeProvisionedCapacityRequest> {

    public Request<DescribeProvisionedCapacityRequest> marshall(DescribeProvisionedCapacityRequest describeProvisionedCapacityRequest) {

        if (describeProvisionedCapacityRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeProvisionedCapacityRequest> request = new DefaultRequest<DescribeProvisionedCapacityRequest>(describeProvisionedCapacityRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeProvisionedCapacity");
        request.addParameter("Version", "2012-06-01");

        if (describeProvisionedCapacityRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(describeProvisionedCapacityRequest.getLoadBalancerName()));
        }

        return request;
    }
}
