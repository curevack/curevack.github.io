window.onload = () => {

    const regularButton = document.getElementById('regularAction');
    const darkButton = document.getElementById('darkAction');
    const regular = document.getElementById('regular');
    const dark = document.getElementById('dark');

    regularButton.onclick = () => {
        disableStylesheet(regular);
        enableStylesheet(dark);
    }

    darkButton.onclick = () => {
        disableStylesheet(regular);
        enableStylesheet(dark);
    }

}

function enableStylesheet (node) {
    node.rel = 'stylesheet';
  }
  
function disableStylesheet (node) {
    node.rel = 'alternate stylesheet';
}
