window.onload = {
  const simpleFunction = document.getElementById('simple-function');
  const functionParameters = document.getElementById('function-parameters');
  const functionReturn = document.getElementById('function-return');
  const functionCalls = document.getElementById('function-calls');
  
  function simpleFunction {
     console.log('functions should consist of statements designed to perform a single task.');
     simpleFunction.textContent = 'functions should consist of statements designed to perform a single task.';
      functionCalls.onclick = simpleFunction;
     }
  functionCalls.onclick = simpleFunction;
  function functionParameters (input) {
     console.log(input);
     functionParameters.textContent = input;
     }
  functionCalls.onclick = functionParameters;
  function functionReturn {
     functionReturn.textContent = 'Many functions return values.';
     return 'Many functions return values.';
     }
  functionCalls.onclick = functionReturn;

  simpleFunction();
  functionParameters('Many functions take parameters.');
  functionReturn();
}
      

