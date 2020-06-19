/**
 * Copyright 2015-2020 yanglb.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yanglb.codegen.utils;

public class Infos {
	public static final String Name       = "Code Generator";
	public static final String Version    = "4.1.0";
	public static final String Copyright  = "Copyright 2015-2020 yanglb.com All Rights Reserved.";
	public static final String Author     = "me@yanglb.com";
	public static final String Website    = "https://yanglb.com";
	public static final String Repository = "https://github.com/excel-code-generator/code-generator";

	public static String sqlHeader () {
		return String.format(
				"-- %s\n" +
				"-- Auto generated by %s v%s\n" +
				"-- \n" +
				"-- %s\n",
				Copyright, Name, Version, Repository);
	}

	public static String cHeader() {
		return String.format(
				"/**\n" +
				" * %s\n" +
				" * Auto generated by %s v%s\n" +
				" * \n" +
				" * %s\n" +
				" */\n",
				Copyright, Name, Version, Repository);
	}

	public static String xmlHeader() {
		return String.format(
				"<!--\n" +
				"    %s\n" +
				"    Auto generated by %s v%s\n" +
				"    \n" +
				"    %s\n" +
				"-->\n",
				Copyright, Name, Version, Repository);
	}
}
