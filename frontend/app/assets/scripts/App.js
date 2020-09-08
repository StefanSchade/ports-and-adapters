import '../styles/styles.css'
import 'lazysizes'

// React Dependencies
import React from 'react'
import ReactDOM from 'react-dom'

// React Components
import ExampleComponent from './modules/ExampleComponent'

ReactDOM.render(<ExampleComponent />, document.querySelector("#my-react-example"))

if (module.hot) {
  module.hot.accept()
}