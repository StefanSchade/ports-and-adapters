import React, {useState} from 'react'

function RegistrationForm (props) {
  const [state, setState] = useState({
    username: '',
    email: '',
    password: ''
  })

  const handleChange = (event) => {
    const {id, value} = event.target
    setState(prevState => ({
      ...prevState,
      [id]: value
    }))
  }

  const handleSubmitClick = (event) => {
    event.preventDefault() // prevents browser from refreshing
    sendDetailsToServer()
  }

  const sendDetailsToServer = () => {
    if (state.username && state.email.length && state.password.length) {
      props.showError(null)
      const payload = {
        'username': state.username,
        'email': state.email,
        'password': state.password
      }
      //TODO: send stuff to back-end
    } else {
      props.showError('Please enter valid username and password')
    }
  }

  return (
    <form>
      <div class='form-group'>
        <label for='username-register' class='text-muted mb-1'>
          <small>Username</small>
        </label>
        <input
          id='username'
          name='username'
          class='form-control'
          type='text'
          placeholder='Pick a username'
          autocomplete='off'
          value={state.username}
          onChange={handleChange} />
      </div>
      <div class='form-group'>
        <label for='email' class='text-muted mb-1'>
          <small>Email</small>
        </label>
        <input
          id='email'
          name='email'
          class='form-control'
          type='email'
          placeholder='you@example.com'
          autocomplete='off'
          value={state.email}
          onChange={handleChange} />
      </div>
      <div class='form-group'>
        <label for='password' class='text-muted mb-1'>
          <small>Password</small>
        </label>
        <input
          id='password'
          name='password'
          class='form-control'
          type='password'
          placeholder='Create a password'
          value={state.password}
          onChange={handleChange} />
      </div>
      <button
        type='submit'
        class='py-3 mt-4 btn btn-lg btn-success btn-block'
        onClick={handleSubmitClick}>
          Sign up for Productmanager
        </button>
    </form>
  )
}

export default RegistrationForm
