  window.onload = () => {
    
    const arrays = {
      numbers: [15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5],
      languageNames: ["Javascript","HTML","CSS","Java","C#","Python","C/C++"]
      };
    
        const numbersAction = document.getElementById("numbers-action");
        const languageNamesAction = document.getElementById("tech-language-names-action");
    
          numbersAction.onclick = () => {
            const numbersDisplay = document.getElementById("numbers-display");
                for (let number of arrays.numbers) {
                  const li = document.createElement("li");
                  li.appendChild(document.createTextNode(number));
                  numbersDisplay.appendChild(li);
              }
          }
            languageNamesAction.onclick = () => {
              arrays.languageNames.sort();
              const languageNamesDisplay = document.getElementById("tech-language-names-display");
                for (let languages of arrays.languageNames) {
                  const li = document.createElement("li");
                  li.appendChild(document.createTextNode(languages));
                  languageNamesDisplay.appendChild(li);
            }
        }
  }
