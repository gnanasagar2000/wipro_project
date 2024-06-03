const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');
const app = express();

const router = express.Router();
const Claim = require('../models/Claim');



app.use(bodyParser.json());
app.use(cors());


app.use('/api/auth', require('./routes/auth'));
app.use('/api/claims', require('./routes/claims'));


mongoose.connect('mongodb+srv://temp:temp@cluster0.kbimxg0.mongodb.net', { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('MongoDB connected'))
    .catch(err => console.log(err));

    router.post('/', async (req, res) => {
        
    });
    
   
    router.get('/:id', async (req, res) => {
    });
    
    module.exports = router;
    
    


const PORT = process.env.PORT || 3000;
app.listen(PORT, () => console.log(`Server started on port ${PORT}`));


