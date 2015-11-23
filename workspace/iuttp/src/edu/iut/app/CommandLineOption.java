package edu.iut.app;

<<<<<<< HEAD
public class CommandLineOption /* EX1 : CLASSE GENERIC SUR le type ValueType */ <ValueType> {
=======
public class CommandLineOption <ValueType>/* EX1 : CLASSE GENERIC SUR le type ValueType */ {
>>>>>>> f73222c3651fa8e5779584886ca257dd153d6947
	
	public enum OptionType{
		NONE("None"),
		FILE("File"),
		STRING("String"),
		INTEGER("Integer"),
		DOUBLE("Double"),
		NOVALUE("NoValue");
		private String optionType;
		
		OptionType(String optionType) {
			this.optionType = optionType;
		}
		
		public String toString() {
			return optionType;
		}		
	}
	
	public CommandLineOption() {		
		/* EX1: Initializer les attributs */
		this.optionType=OptionType.NONE;
		this.key="";
		this.description="";
		this.value=null;
		this.defaultValue=null;
	}
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
<<<<<<< HEAD
		this.key = key;
		this.description = description;
		this.defaultValue = defaultValue;
		
=======
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
>>>>>>> f73222c3651fa8e5779584886ca257dd153d6947
	}
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
<<<<<<< HEAD
		this.defaultValue = defaultValue;
=======
		this.defaultValue=defaultValue;
>>>>>>> f73222c3651fa8e5779584886ca257dd153d6947
	}
	public void setValue(ValueType value) {
		this.value = value;
	}
		
	public String getKey() {
		return this.key;
	}
	public String getDescription() {
		return this.description;
	}
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	public OptionType getOptionType() {
		return optionType;
	}

	protected String key;
	protected String description;
	protected ValueType defaultValue;
	protected ValueType value;
	protected OptionType optionType;
	

}
