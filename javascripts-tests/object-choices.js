    class Custom_Class {
        giveString() {
            return 'Custom Class';
        }
    } 
    
    var simpleObject = {
    sayName: function () {
       return "Simple Object.";
        }
    }

 function FunctionObject() {
     this.privateFunction = function () {
         return "Private Function";
     }
    }
    
 FunctionObject.prototype.sayName = function () {
        return this.privateFunction();
        }

    var functionObject = new FunctionObject();
    functionObject.sayName();
    
    simpleObject.sayName();
    simpleObject.dynamicMethod;

    console.log(simpleObject.sayName());
    simpleObject.dynamicMethod = console.log("Dynamic Method"); 
    console.log(functionObject.privateFunction());
    console.log(new Custom_Class().giveString());
    
