package edu.iut.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;

public class CommandLineParser<ValueType> {
	
<<<<<<< HEAD
	protected HashMap<String, CommandLineOption/* EX1: option generique */> options;
	protected ArrayList<String> parseErrors;
		
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption<> >();
=======
	protected HashMap<String, CommandLineOption<ValueType>> options;
	protected ArrayList<String> parseErrors;
		
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption<ValueType>>();
>>>>>>> f73222c3651fa8e5779584886ca257dd153d6947
		parseErrors = new ArrayList<String>();
	}
	
	public void addOption(CommandLineOption<?> option) {
		if (option != null) {
			options.put(option.getKey(),(CommandLineOption<ValueType>) option);
		}
	}
	
	public void parse(String[] args) {
		for (String argument: args) {
			String[] keyValue=argument.split("=");
			if (options.containsKey(keyValue[0])) {
				switch (((CommandLineOption<?>)options.get(keyValue[0])).getOptionType()) {
					case FILE:
						CommandLineOption<File> fileOption = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					/* EX1 : reproduire le comportement de 'case FILE', pour STRING,INTEGER, ... */

					default:
						parseErrors.add("Unrecognize option type.");						
				}
			}
		}
	}
	
	public CommandLineOption<?> getOption(String key) {
		if (options.containsKey(key)) {
			return options.get(key);
		}
		return null;
	}
	
	public ArrayList<String> getErrors() {
		return parseErrors;
	}
	
}
