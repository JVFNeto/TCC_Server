import { ReactComponent as Githubicon } from 'assets/img/Github.svg';
import './style.css'

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>Movies</h1>
                    <a href="https://github.com/JVFNeto">
                        <div className="dsmovie-contact-container">
                            <Githubicon />
                            <p className='dsmovie-contact-link'>/JVFNeto</p>
                        </div>


                    </a>
                </div>


            </nav>


        </header>
    );

}

export default Navbar;