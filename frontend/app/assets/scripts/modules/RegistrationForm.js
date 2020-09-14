import React, {useState} from 'react'

function RegistrationForm (props) {
  const [state, setState] = useState({
    username: '',
    email: '',
    password: ''
  })

  const handleChange = (e) => {
    const {id, value} = e.target
    setState(prevState => ({
      ...prevState,
      [id]: value
    }))
  }

  return (
    <form>
      <div class='form-group'>
        <label for='username-register' class='text-muted mb-1'>
          <small>Username</small>
        </label>
        <input id='username-register' name='username' class='form-control' type='text' placeholder='Pick a username' autocomplete='off' />
      </div>
      <div class='form-group'>
        <label for='email-register' class='text-muted mb-1'>
          <small>Email</small>
        </label>
        <input id='email-register' name='email' class='form-control' type='text' placeholder='you@example.com' autocomplete='off' />
      </div>
      <div class='form-group'>
        <label for='password-register' class='text-muted mb-1'>
          <small>Password</small>
        </label>
        <input id='password-register' name='password' class='form-control' type='password' placeholder='Create a password' />
      </div>
      <button type='submit' class='py-3 mt-4 btn btn-lg btn-success btn-block'>
          Sign up for Productmanager
        </button>
    </form>
  )
}

export default RegistrationForm
