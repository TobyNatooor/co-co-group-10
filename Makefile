antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
# classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java ccVisitor.java ccBaseVisitor.java


all:	
	make run

ccLexer.java:	cc.g4
	$(antlr4) -visitor cc.g4

grun:	ccLexer.class 04-von-Neumann.hw
	$(grun) cc start -gui -tokens 04-von-Neumann.hw

main.class:	ccLexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

run:	main.class
	java -cp $(classpath) main 04-von-Neumann.hw

clean:
	rm $(GENERATED) *.class cc.interp ccLexer.interp ccLexer.tokens cc.tokens

# all:	
# 	make grun

# ccLexer.java:	cc.g4
# 	$(antlr4) cc.g4

# ccLexer.class:	ccLexer.java
# 	javac -cp $(classpath) $(GENERATED)

# grun:	ccLexer.class # cc.txt
# 	$(grun) cc start -gui -tokens 04-von-Neumann.hw
