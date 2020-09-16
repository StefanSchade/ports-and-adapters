import '../styles/styles.css'
import 'lazysizes'

// React Dependencies
import React, {useState} from 'react'
import ReactDOM from 'react-dom'
import {
  BrowserRouter as Router,
  Switch,
  Route
} from 'react-router-dom'

// React Components
import ExampleComponent from './modules/ExampleComponent'
import Header from './modules/Header'
import RegistrationForm from './modules/RegistrationForm'
import Footer from './modules/Footer'
import Alert from './modules/Alert'

function AppComponent () {
  const [errorMessage, updateErrorMessage] = useState(null)
  return (
    <Router>
      <div className='App'>
        <Header />
        <div className='container py-md-5'>
          <div class='row align-items-center'>
            <div class='col-lg-5 pl-lg-5 pb-3 py-lg-5'>
              <Switch>
                <Route path='/' exact>
                  <RegistrationForm showError={updateErrorMessage}/>
                </Route>
              </Switch>
              <Alert errorMessage={errorMessage} hideError={updateErrorMessage}/>
            </div>
          </div>
        </div>
        <Footer />
      </div>
    </Router>
  )
}

ReactDOM.render(<AppComponent />, document.getElementById('root'))

if (module.hot) {
  module.hot.accept()
}
