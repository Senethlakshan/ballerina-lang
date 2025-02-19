/*
 *  Copyright (c) 2023, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerina.projects.buildtools;

/**
 * {@code CodeGeneratorTool} represents a Ballerina build tool.
 *
 * @since 2201.9.0
 */
public interface CodeGeneratorTool {
    /**
     * Execute the command.
     *
     * @param  toolContext the {@link ToolContext} of the build tool
     */
    void execute(ToolContext toolContext);

    /**
     * Retrieve the tool name.
     *
     * @return the name of the tool.
     */
    String toolName();
}
