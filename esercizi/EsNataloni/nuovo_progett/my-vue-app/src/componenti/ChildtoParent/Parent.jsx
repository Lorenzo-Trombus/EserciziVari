import React,{useState} from "react";
import Child from "./Child";


function Parent() {
    const [message, setMessage]=useState('');

    const handleMessage = (childMessage)=> {
        setMessage(childMessage);
    };

    return (
        <div>
            <h1>messaggio da child: {message}</h1>
            {/*passa la funzione handleMessage come prop al child*/}
            <Child onMessage={handleMessage}/>
        </div>
    )
}

export default Parent;