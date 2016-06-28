package com.jianglibo.goracli;

import java.util.Arrays;

import org.apache.gora.compiler.cli.GoraCompilerCLI;

public class EntryPoint {

	private void println(Object o) {
		System.out.println(o);
	}

	private void printHelp() {
		println("Usage: run COMMAND [COMMAND options]");
		println("where COMMAND is one of:");
		println("  goracompiler               Run Compiler");
		println("  specificcompiler           Run Avro Specific Compiler");
		println("  dynamocompiler             Run Gora DynamoDB Compiler");
		println("  goracisetup                Run the GoraCI Rackspace orchestration setup");
		println("  logmanager                 Run the tutorial log manager");
		println("  loganalytics               Run the tutorial log analytics");
		println("  loganalyticsspark          Run the tutorial log analytics spark");
		println("  junit         	     Run the given JUnit test");
		println("  version         	     Print Gora version to terminal");
		println(" or");
		println(" MODULE CLASSNAME   run the class named CLASSNAME in module MODULE");
		println("Most commands print help when invoked w/o parameters.");
	}

	public static void main(String[] args) {
		EntryPoint ep = new EntryPoint();
		if (args.length == 0) {
			ep.printHelp();
			System.exit(0);
		}
		String cmd = args[0];
		String[] params = Arrays.copyOfRange(args, 1, args.length);
		ep.run(cmd, params);
	}

	private void run(String cmd, String[] args) {
		switch (cmd) {
		case "goracompiler":
			GoraCompilerCLI.main(args);
			break;
		case "version":
			org.apache.gora.util.VersionInfo.main(args);
			break;
		default:
			printHelp();
			System.exit(0);
		}
	}

}
