const app = new Vue({
  el: '#app',
  template: `
	  <div>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vue/2.0.3/vue.js"></script>
		<div v-if="mostrar">
   			{{ mensaje }}
			<img :src="imagen"/>
		</div>
		<button v-on:click="cambiarMostrar()">Mostrar/Ocultar</button>
	  </div>
		`,
  data: {
	  mostrar: false,
	  mensaje: "Hola Vue!",
	  imagen: "http://laravelacademy.org/wp-content/uploads/2016/08/00-featured-vuejs-logo-simple-256x128.jpg"
  },
  methods: {
	  cambiarMostrar: function(){
		  this.mostrar = !this.mostrar
	  }
  }
})