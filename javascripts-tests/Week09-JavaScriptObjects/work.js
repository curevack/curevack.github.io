  function divider(title) {
  console.log("====================================");
  console.log(title);
  console.log("====================================");
  };

  var person = {
    firstName: 'Kerim',
    lastName: 'Curevac',
    fullName: function () {
        return this.firstName+ " "+ this.lastName;
    }
  };

  var calculator = {
    operand01: -1,
    operand02: -1,
    add: function() {
      return "Add: " + (calculator.operand01 + calculator.operand02);
    },
    subtract: function () {
      return "Subtract: " + (calculator.operand01 - calculator.operand02);
    }
  };

  console.log(divider("Person"));
  console.log(person.firstName);
  console.log(person.lastName);
  console.log(person.fullName());
  console.log(divider("Calculator"));
  calculator.operand01 = person.firstName.length;
  calculator.operand02 = person.lastName.length;
  calculator.multiply = calculator.operand01 * calculator.operand02;
  console.log("Operand01 = "+ calculator.operand01);
  console.log("Operand02 = "+ calculator.operand02);
  console.log(calculator.add());
  console.log(calculator.subtract());
  console.log("Multiply = "+ calculator.multiply);

  

  
