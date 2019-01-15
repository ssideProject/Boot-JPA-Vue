<template>
  <div class="container mt-5 mb-5">
	<div class="row">
	  <div class="col-md-6 offset-md-3">
	    <h4>Latest play</h4>
	      <ul class="timeline">
			  <li v-for="score in scores" :key="score.id" >
			    <a href="#">{{score.id}}</a>
				<a href="#" class="float-right">{{score.matchDate}}</a>
			    <h3>score: {{score.score}}</h3>
			  </li>
		  </ul>
	  </div>
	</div>
  </div>
</template>

<script>
export default {
    name: Timeline,
    data () {
        return {
        scores: store.scores
        }
    },
}
</script>

<style>
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
    z-index: 400;
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
    z-index: 400;
}
</style>