 window.onload = () => {
  const simpleObjectAction = 
        document.getElementById('simple-object-action');
  
  const functionObjectAction = 
        document.getElementById('function-object-action');
  
  const customClassAction = 
        document.getElementById('custom-class-action');

    simpleObjectAction.onclick = () => {
        const simpleObjectDisplay = document.getElementById('simple-object-display');

        simpleObjectDisplay.textContent = simpleObject.sayName(); + " " + 'Dynamic Method';
    }; 

    functionObjectAction.onclick = () => {
        const functionObjectDisplay = document.getElementById('function-object-display');

        functionObjectDisplay.textContent = "Private Function";
    }; 
 
    customClassAction.onclick = () => {
        const customClassDisplay = document.getElementById('custom-class-display');

        customClassDisplay.textContent = "Custom Class";
    };
  
  };

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
    
