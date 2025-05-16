import React from "react";



function Child({onMessage}) {
    const sendMessageToParent = () => {
        onMessage('Ciao da child');
    };

    return (
        <div>
            <button onClick = {sendMessageToParent}>invia messaggio a Parent</button>
        </div>
    );
};


export default Child;