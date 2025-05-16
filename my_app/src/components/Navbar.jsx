import './Navbar.css'
import Link from './Link'
const x=12;
const img ="vite";

const imgStyle={
    height: x<10 ? "800px":"500px",
    borderRadius: "90px"
}


function Navbar() {
    return(
        <>
        <nav>{x}</nav>
        <img className="bordoArrotondato" style= {imgStyle} src={`/${img}.svg`}></img>
        <ul>
            <li><Link></Link></li>
            <li><Link></Link></li>
            <li><Link></Link></li>
            <li><Link></Link></li>
            <li><Link></Link></li>
            <li><Link></Link></li>

        </ul>
        </>
    )
}

export default Navbar