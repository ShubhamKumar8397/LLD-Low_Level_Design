# Abstraction & Encapsulation

We Call Four Pillar of OOPs 
- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

## Abstraction
Abstraction Hides Unnecessary Details from a client & showcase only What is necessary;<br>
This Can be understand By a Class , but we not understand , so Understand As a backend Dev

```javascript
const user = await User.findOne({ email });
```

 Whats Abstraction in This , what mongoose hides from us..
- thats a normal Query To Fetch User , but we dont care what mongoose do to fetch this user ..

### Mongoose Do
```
open TCP connection
create MongoDB protocol message
send request
wait for response
parse BSON
handle connection pool
...
```
We Dont Care of This , Mongoose just provides a high-level API that hides the lower-level database/driver operations from our application code.,,,, Thats Abstraction
```
# We only cares
WHAT I WANT
     ↓
find a user
     ↓
User.findOne(...)

We Dont Care How It is Actually Perform
```

Thats The Best Example For developer To understand Abstraction
## Lets Now Take A OOPs Example

<img src="../Z-DocumentsFoder/1.png" alt="AbstractionImage">

- **Interface** → WHAT functionality is available
- Implementing class → HOW that functionality works
- Different car classes can implement the same interface differently/ How car start depends properly on class , how it wants to start the car
- Interface methods are compulsory for implementing classes
- Classes can have additional functionality of their own
- ser of the class doesn't need to know the internal implementation
- That's the core idea of abstraction


## Encapsultion
In simple Words , Encapsulation ka matlab hota hai ek Object ke Characters And Behaviours ek hi jagah honi chaiye With Certain Security Aspects Aslo

In Terms of Coding , Encapsulation = keeping related data + the operations that control that data together, while preventing outside code from directly messing with the internal state.

### Easy Language mein Samghaoo, Bank Account Example,
<img src="../Z-DocumentsFoder/2.png" alt="AbstractionImage">