# solid-principles

SOLID Design Principles

- S - Single Responsibility Principle (SRP)
- O - Open-Close Principle (OCP)
- L - Liskov's Substitution Principle (LSP)
- I - Interface Segregation Principle (ISP)
- D - Dependency Inversion Principle (DIP)

1. SRP <br/>
	Every software component should have one and only one <responsibility / reason to change>.
	
	- Focus for high cohesion and loose coupling.
	
2. OCP <br/>
	Software components should be closed for modification, but open for extension.
	
	- To add new features existing software component should not be altered.

3. LSP <br/>
	Objects should be replaceable with its subtypes without affecting the correctness of the program.
	
	- Change the IS-A way of thinking
	- Solution 1: Break the hierarchy
	- Solution 2: Tell, don't ask
	
4. ISP <br/>
	No client should be forced to depend on the methods it does not use.
	
	- Violations of ISP -> Fat interfaces, interfaces with low cohesion, empty method implementations.
	
5. DIP <br/>
	High-level modules should not depend on low-level modules, both should depend on abstractions and abstractions should not depend on details rather details should depend on abstractions.
	
	- Dependency Injection is different from Dependency Inversion

