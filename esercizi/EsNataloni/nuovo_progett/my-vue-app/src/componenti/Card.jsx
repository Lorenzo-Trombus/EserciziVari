function Card({titolo, imagesrc, descrizione, isVisited}) {
    // const titolo=props.titolo
    // const descrizione= props.descrizione
    // const ingUrl=props.imgUrl

    return(
        <div>
        <img src={imagesrc} alt=""></img>
        <div>

            </div>
            <h2> {titolo} </h2>
            <p> {descrizione} </p>
            {isVisited && <span><b> Me gusta </b></span>}
            </div>
    )
}
export default Card;