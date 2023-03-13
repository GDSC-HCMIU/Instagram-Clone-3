import React from 'react';
import './Login.css';
import IgLogo from './instagramlogo.png';

const Login = () => {
  return (
    <div className="container">
          <div className="center">
            <div className="header">
              <img src={IgLogo} alt="instagramLogo" class="instaLogo" />
            </div>
            <div className="inputElement">
              <input
                type="text"
                placeholder="Phone number,username or email"
                className="inputText"
              />
              <input type="password" placeholder="Password" className="inputText" />
              <input type="submit" value="Log in" className="inputButton"/>
              
              <div className="line">
                <span className="arrow"></span>
                <span className="content">OR</span>
                <span className="arrow"></span>
              </div>
              <div className="social__icon">
                <span>Log in with facebook</span>
              </div>
              <a className="forgetPassword">Forget Password?</a>
            </div>
          </div>
          <div className="footer">
            <p>Don't have an accout?<a>Sign Up</a></p>
          </div>
        </div>
  )
}

export default Login