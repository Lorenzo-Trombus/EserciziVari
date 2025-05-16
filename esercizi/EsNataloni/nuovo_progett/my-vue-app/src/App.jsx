import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Card from './componenti/Card'
import TodoList from './componenti/Stato/Todolist'
import Parent from './componenti/ChildtoParent/Parent'
function alertClick(){
  alert("HALLO")
}
function handleChange(e){
  console.log(e.target.value)
}

function handleSubmit(e){
  e.preventDefault()
  console.log(e)
}

function App() {
  const [count, setCount] = useState(0)
  const people=[
    {id:0,
      titolo: "cofondatore di H&M",
      descrizione: "un pittore permaloso",
      imagesrc:"https://images.unsplash.com/photo-1723464840524-d5674220263f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGhpdGxlcnxlbnwwfHwwfHx8MA%3D%3D",
      isVisited: true,
    },
    {id:1,
      titolo : "Benitus",
      descrizione : "meglio il culo in un cesso che un cesso nel culo",
      imagesrc:"https://media.istockphoto.com/id/177531805/it/foto/ajman-1972-benito-mussolini-serie-di-figure-seconda-guerra-mondiale.webp?a=1&b=1&s=612x612&w=0&k=20&c=N3-TnoxmoQawO-nNOMjWLBA6pVp0viAbakzPsSuH1QM=",
      isVisited:true ,
    }

  ]
  return (
    <>
    <Parent></Parent>
    <TodoList></TodoList>
    <Card 
          isVisited={true}  
          titolo = "Adolfo"
          descrizione = "meglio il culo in un cesso che un cesso nel culo"
          imagesrc="https://images.unsplash.com/photo-1723464840524-d5674220263f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGhpdGxlcnxlbnwwfHwwfHx8MA%3D%3D"></Card>
    <Card isVisited={true} 
          titolo = "Benitus"
          descrizione = "meglio il culo in un cesso che un cesso nel culo"
          imagesrc="https://media.istockphoto.com/id/177531805/it/foto/ajman-1972-benito-mussolini-serie-di-figure-seconda-guerra-mondiale.webp?a=1&b=1&s=612x612&w=0&k=20&c=N3-TnoxmoQawO-nNOMjWLBA6pVp0viAbakzPsSuH1QM="></Card>
    <Card isVisited={false} 
          titolo = "Oussama"
          descrizione = "meglio il culo in un cesso che un cesso nel culo"
          imagesrc="https://images.unsplash.com/photo-1529586281508-1eef0007ceff?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8b3NhbWElMjBiaW4lMjBsYWRlbnxlbnwwfHwwfHx8MA%3D%3D"></Card>
    <Card isVisited={false} 
          titolo = "banana giò"
          descrizione = "meglio il culo in un cesso che un cesso nel culo"
          imagesrc="https://images.unsplash.com/photo-1534105947348-dbfa3a44934b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGJhbmFuYSUyMGdpb3xlbnwwfHwwfHx8MA%3D%3D"></Card>
    <Card isVisited={true} 
          titolo = "Moni Tancini"
          descrizione = "meglio il culo in un cesso che un cesso nel culo"
          imagesrc="https://images.unsplash.com/photo-1534105947348-dbfa3a44934b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGJhbmFuYSUyMGdpb3xlbnwwfHwwfHx8MA%3D%3D"></Card>  
      
          {people.map((person)=>(
            <Card key={person.id}
            titolo = {person.name}
            imagesrc={person.imagesrc}
            isVisited={person.isVisited}
            descrizione={person.descrizione}>
            </Card>  
          ))}

          {people.filter((person)=> person.isVisited).map((person)=>(
            <Card key={person.id}
            titolo = {person.name}
            imagesrc={person.imagesrc}
            isVisited={person.isVisited}
            descrizione={person.descrizione}>
            </Card>  
          ))}
      <div>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          piselli in culo {count}
        </button>
        <button onClick={(alertClick)}>
          lesgoSky
        </button>
        <form onSubmit={handleSubmit}>
          <button type="Submit">
            è così che si fa
          </button>
        </form>
        <input type='text' onChange={handleChange}/>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
