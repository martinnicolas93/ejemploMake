JC = javac

all: Programa.class

Programa.class: Programa.java Utilitario.class
	$(JC) Programa.java
	
Utilitario.class: Utilitario.java
	$(JC) Utilitario.java
	
clean:
	$(RM) *.class
