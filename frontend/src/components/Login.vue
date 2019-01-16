<template>
    <div class="container">
        <div class="login-form">
            <div class="main-div">
                <form id="Login">
                    <div class="form-group">
                        <input type="email" class="form-control" id="inputEmail" placeholder="Email Address">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    </div>
                    <div class="forgot">
                        <a href="#">Forgot password?</a>
                    </div>
                    <button type="submit" class="btn btn-primary">Login</button>
                    <router-link :to="{name : 'Register'}">
                        <button class="btn btn-default">Register</button>
                    </router-link>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    created(){
        console.log('login')
    }
}
</script>

<style>
.form-heading { color:#fff; font-size:23px;}
.panel p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}
.login-form .form-control {
  background: #f7f7f7 none repeat scroll 0 0;
  border: 1px solid #d4d4d4;
  border-radius: 4px;
  font-size: 14px;
  height: 40px;
  line-height: 40px;
}
.main-div {
  background: #ffffff none repeat scroll 0 0;
  border-radius: 2px;
  margin: 10px auto 30px;
  max-width: 38%;
  padding: 50px 70px 70px 71px;
}
.login-form .form-group {
  margin-bottom:10px;
}
.login-form{ text-align:center;}
.forgot a {
  color: #777777;
  font-size: 14px;
  text-decoration: underline;
}
.login-form  .btn.btn-primary {
  background: #1897ff none repeat scroll 0 0;
  border-color: #1897ff;
  color: #ffffff;
  font-size: 14px;
  width: 100%;
  height: 40px;
  line-height: 40px;
  padding: 0;
  margin-bottom:10px;
}
.login-form  .btn.btn-default {
  background: #adadad none repeat scroll 0 0;
  border-color: #adadad;
  color: #ffffff;
  font-size: 14px;
  width: 100%;
  height: 40px;
  line-height: 40px;
  padding: 0;
}
.forgot {
  text-align: left; margin-bottom:30px;
}
.botto-text {
  color: #ffffff;
  font-size: 14px;
  margin: auto;
}
.login-form .btn.btn-primary.reset {
  background: #ff9900 none repeat scroll 0 0;
}
.back { text-align: left; margin-top:10px;}
.back a {color: #444444; font-size: 13px;text-decoration: none;}
</style>