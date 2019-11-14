## S.O.L.I.D

S.O.L.I.D principle purpose make software designs more understandable, flexible and maintainable not related from 
GRASP (General Responsibility Assignment Software Principles) principle but, the principle subset from uncle bob, who is uncle bob, he is known as gang of four. 

we know, as long as we know that the business always grow, the software design surely will be complex. 
as developer maintenance the complex software design are very frustrated. 

S.O.L.I.D principle are acronym from :
Jelaskan tentang prinsip SOLID, kenapa prinsip itu ada, contoh pelanggaran prinsip, etc


### Single responsibility  
uncle bob said:"One class should have one and only one reason to change"
is like a class should only one reason, or only one time it should change ?
no, it can multiple reason to change, it chould be change multiple number of time change over the time period. 
but, we talking about context.  
just look example. 


### Open-Close
uncle bob said:"Software components should be open for extension, but closed for modification"
the simple way to imagine that principle is electric plug.



### Liskov substitution segregation 
uncle bob said:"Derived types must be completely substitutable for their base types";
it's like if duck is subtype of bird so duck must have to be able to fly. 


### Interface segregation  
uncle bob said:"Clients should not be forced to implement unnecessary methods which they will not use"
"fat interfaces lead to inadvertent coupling between classes"
“Do really need all the methods on this interface I’m using? If not how can I break them into smaller interfaces?”.
just look example. 


### Dependency inversion principle 
uncle bob said:"Depend on abstractions, not on concretions"
