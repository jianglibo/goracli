package com.jianglibo.goracli;

import java.util.HashMap;
import java.util.Map;

public class CommandNames {
	
	public static final String goracompiler = "goracompiler";
	public static final Map<String, String> nameToClass = new HashMap<>();
	static {
		nameToClass.put("goracompiler","org.apache.gora.compiler.cli.GoraCompilerCLI" );
		nameToClass.put("specificcompiler","org.apache.avro.specific.SpecificCompiler" );
		nameToClass.put("goracompiler","" );
		nameToClass.put("dynamocompiler","" );
		nameToClass.put("version","" );
	}

}
