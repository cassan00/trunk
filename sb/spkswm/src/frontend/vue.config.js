const path = require('path');

module.exports = {
	outputDir : path.resolve(__dirname, "../" + "main/resources/static"),
	devServer: {
		/* PROXY 설정 */
		/* http://localhost:8080/api 로 호출하면 target 으로 */
		proxy: {
		  '/api': {
				target: 'http://localhost:9000/spkswm/login',
				ws: true,
				changeOrigin: true
		  }
		}
	}

}



