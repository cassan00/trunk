module.exports = {
	devServer: {
		proxy: {
		  '/api': { /* http://localhost:8080/api 로 호출하면 아래 소스로 프록시 */
				target: 'http://localhost:9000/spkswm/login',
				ws: true,
				changeOrigin: true
		  }
		}
	}

}



