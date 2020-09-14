import '../styles/styles.css'
import 'lazysizes'

// React Dependencies
import React from 'react'
import ReactDOM from 'react-dom'

// React Components
import ExampleComponent from './modules/ExampleComponent'
import Header from './modules/Header'
import RegistrationForm from './modules/RegistrationForm'
import Footer from './modules/Footer'

function AppComponent () {
  return (
    <div className='App'>
      <Header />
      <div className='container py-md-5'>
        <div class='row align-items-center'>
          <div class='col-lg-5 pl-lg-5 pb-3 py-lg-5'>
            <RegistrationForm />
          </div>
        </div>
      </div>
      <Footer />
    </div>
  )
}

ReactDOM.render(<AppComponent />, document.getElementById('root'))

if (module.hot) {
  module.hot.accept()
}
