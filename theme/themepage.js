window.onload = () => {

    const regularButton = document.getElementById('darkAction');
    const darkButton = document.getElementById('lightAction');
    const dark = document.getElementById('dark');
    const light = document.getElementById('light');

    darkButton.onclick = () => {
        disableStylesheet(light);
        enableStylesheet(dark);
    }

    lightButton.onclick = () => {
        disableStylesheet(dark);
        enableStylesheet(light);
    }

}

function enableStylesheet (node) {
    node.rel = 'stylesheet';
  }
  
function disableStylesheet (node) {
    node.rel = 'alternate stylesheet';
}
