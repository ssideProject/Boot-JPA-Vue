<template>
  <div class="container mt-5 mb-5">
	<div class="main-div">
	  <div class="col-md-9 offset-md-3">
	    <h4>Latest play</h4>
	      <ul class="timeline">
			  <li v-for="score in scores" :key="score.id" >
			    player: <a href="#">{{score.userId}}</a>
				match date: <a href="#" class="float-right">{{score.matchDate}}</a>
			    <p>score: {{score.score}}</p>
			  </li>
		  </ul>
	  </div>
	</div>
  </div>
</template>

<script>
import { store } from "../store.js";
export default {
    data () {
        return {
            scores: store.scores
        }
    },
}
</script>

<style>
.main-div {
  background: #ffffff none repeat scroll 0 0;
  border-radius: 2px;
  margin: 10px auto 30px;
  max-width: 100%;
  padding: 50px 70px 70px 71px;
}

ul.timeline {
    list-style-type: none;
    position: relative;
}
ul.timeline:before {
    content: ' ';
    background: #d4d9df;
    display: inline-block;
    position: absolute;
    left: 29px;
    width: 2px;
    height: 100%;
    z-index: 200;
}
ul.timeline > li {
    margin: 20px 0;
    padding-left: 20px;
}
ul.timeline > li:before {
    content: ' ';
    background: white;
    display: inline-block;
    position: absolute;
    border-radius: 50%;
    border: 3px solid #22c0e8;
    left: 20px;
    width: 20px;
    height: 20px;
    z-index: 200;
}
</style>