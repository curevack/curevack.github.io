window.onload = () => {

    const myForm = document.getElementById('sort-type');

    myForm.addEventListener('submit', (event) => {
    event.preventDefault();
    const value = document.querySelector('input[name="sorter"]:checked').value;
        if (value.toLowerCase() === 'blue') {
            setColor("blueBackground");
            showChoice(value);

        } else if (value.toLowerCase() === 'green') {
            setColor("greenBackground");
            showChoice(value);

        } else if (value.toLowerCase() === 'red') {
            setColor("redBackground");
            showChoice(value);

        } else if (value.toLowerCase() === 'yellow') {
            setColor("yellowBackground");
            showChoice(value);
            
        } else if (value.toLowerCase() === 'purple') {
            setColor("purpleBackground");
            showChoice(value);
        }
    });

    let currentClass = null;

    const setColor = (className) => {
        console.log("SET CLASS TO", className);
        var element = document.getElementById("form-section");
        if (currentClass) {
        element.classList.remove(currentClass);        
        }
        currentClass = className;
        element.classList.add(className);
    }
}
    const showChoice = (color) => { 
        const displayText = document.getElementById('user-choice');
        if (color === 'Blue') {
            changeStyle("radiostyles/blue.css");
            displayText.textContent= 'Blue';
        }
        else if (color === 'Green') {
            changeStyle("radiostyles/green.css");
            displayText.textContent = 'Green';
        }
        else if (color === 'Red') {
            changeStyle("radiostyles/red.css");
            displayText.textContent = 'Red';
        }
        else if (color === 'Yellow') {
            changeStyle("radiostyles/yellow.css");
            displayText.textContent = 'Yellow';
        }
        else if (color === 'Purple') {
            changeStyle("radiostyles/purple.css");
            displayText.textContent = 'Purple';
        }

    }
    function changeStyle(sheet) {
        document.getElementById("lstyle").setAttribute("href",sheet)
    }
