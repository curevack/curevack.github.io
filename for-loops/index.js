window.onload = () => {
    const listButton = document.getElementById('run-for-loop');

    listButton.onclick = () => {
        const myList = document.getElementById('my-list');
            for (i=0; i<=5; i++) {
                elfCode.appendToList(myList, i);
        }
    }
}                    
