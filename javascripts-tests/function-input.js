window.onload = () => {
  const feetToInchesAction = 
        document.getElementById('feet-to-inches-action');

    feetToInchesAction.onclick = () => {
        const feetToInchesInput = document.getElementById('feet-to-inches-input');
        const feetToInchesDisplay = document.getElementById('feet-to-inches-display');

        feetToInchesDisplay.textContent = feetToInches(feetToInchesInput.value);
    };
  };
  const feetToInches = (feet) => {
    return feet * 12;
  };
  
  const milesToFeetAction = 
        document.getElementById('miles-to-feet-action');

    milesToFeetAction.onclick = () => {
        const milesToFeetInput = document.getElementById('miles-to-feet-input');
        const milesToFeetDisplay = document.getElementById('miles-to-feet-display');

        milesToFeetDisplay.textContent = milesToFeet(milesToFeetInput.value);
    };
  };
  const milesToFeet = (miles) => {
    return miles * 5280;
  };
  
  const areaOfTriangleAction = 
        document.getElementById('area-of-triangle-action');

    areaOfTriangleAction.onclick = () => {
        const areaOfTriangleInput = document.getElementById('area-of-triangle-input');
        const areaOfTriangleDisplay = document.getElementById('area-of-triangle-display');

        areaOfTriangleDisplay.textContent = areaOfTriangle(areaOfTriangleInput.value);
    };
  };
  function areaOfTriangle (base, height) {
    return (base * height) / 2; 
  };
  
  const areaOfCircleAction = 
        document.getElementById('area-of-circle-action');

    areaOfCircleAction.onclick = () => {
        const areaOfCircleInput = document.getElementById('area-of-circle-input');
        const areaOfCircleDisplay = document.getElementById('area-of-circle-display');

        areaOfCircleDisplay.textContent = areaOfCircle(areaOfCircleInput.value);
    };
  };
  funciton areaOfCircle (radius) {
    return Math.PI * (radius ** 2);
}
