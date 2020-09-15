import React from 'react'

function Header () {
  return (
    <header class='header-bar bg-primary mb-3'>
      <div class='container d-flex flex-column flex-md-row align-items-center p-3'>
        <h4 class='my-0 mr-md-auto font-weight-normal'>
          <a href='/' class='text-white'>
            Productmanager
          </a>
        </h4>
        <form class='mb-0 pt-2 pt-md-0'>
          <div class='row align-items-center'>
            <div class='col-md mr-0 pr-md-0 mb-3 mb-md-0'>
              <input name='username' class='form-control form-control-sm input-dark' type='text' placeholder='Username' autocomplete='off' />
            </div>
            <div class='col-md mr-0 pr-md-0 mb-3 mb-md-0'>
              <input name='password' class='form-control form-control-sm input-dark' type='password' placeholder='Password' />
            </div>
            <div class='col-md-auto'>
              <button class='btn btn-success btn-sm'>Sign In</button>
            </div>
          </div>
        </form>
      </div>
    </header>
  )
}

export default Header
