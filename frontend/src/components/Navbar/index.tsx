import { ReactComponent as GithubIcon } from 'assets/img/Github.svg';
import { ReactComponent as SearchIcon }from 'assets/img/Search.svg'
import './style.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>Near Movies</h1>

                    <form className="d-flex ">
                        <input className='form-control' type="text"/>
                        <button className='btn'>  <SearchIcon className='icon'/> </button>
                        
                        </form>
                    
                    <a href="https://github.com/JVFNeto">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/Perfil do DEV</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;