/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.runtime.webmonitor.handlers;

import org.apache.flink.runtime.instance.ActorGateway;

import java.util.Map;

public class JarAccessDeniedHandler extends AbstractJsonRequestHandler {

	private static final String ERROR_MESSAGE = "{\"error\": \"Web submission interface is not " +
			"available for this cluster. To enable it, set the configuration key ' jobmanager.web.submit.enable.'\"}";

	@Override
	public String handleJsonRequest(Map<String, String> pathParams, Map<String, String> queryParams, ActorGateway jobManager) throws Exception {
		return ERROR_MESSAGE;
	}
}
