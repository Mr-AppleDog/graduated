<template>
	<view>
		<!-- 自定义导航栏 -->
		<CustomNavbarVue></CustomNavbarVue>
		<button @click="testtestDome()">测试</button>
		<uni-card v-for="item in date" :title="item.title" extra="额外信息" >
			<text>{{item.number}}</text>
		</uni-card>
	</view>
</template>

<script>
	import CustomNavbarVue from './components/CustomNavbar.vue'
	
	import { testDome } from '../../api/system/user'
	export default {
		data() {
			return {
				date:[
					{title:"测试",number:2},
					]
			}
		},
		components:{
			CustomNavbarVue
		},
		methods: {
			testtestDome(){
				testDome().then(resp =>{
					this.date=resp.rows
					console.log(resp.rows);
				})
			}
		},
		onLoad(){
			this.testtestDome();
		},
	}
</script>

<style>

</style>
