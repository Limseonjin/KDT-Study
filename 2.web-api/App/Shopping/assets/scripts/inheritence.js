
class Pet {
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    introduce( ){
        console.log(`제 이름은 ${this.name} , 나이는 ${this.age}살 이에요 `);
    }
}
class Dog extends Pet{
    constructor(name, age, hobby){
        super(name, age)
        this.hobby = hobby
    }
}

class Cat extends Pet{
    constructor(name, age, sleep){
        super(name, age)
        this.sleep = sleep
    }
}

const dog = new Dog('해피',4,'싸돌아당기기');
const cat = new Cat('나비',5,'캣타워에서 잠자기');

dog.introduce();
cat.introduce();