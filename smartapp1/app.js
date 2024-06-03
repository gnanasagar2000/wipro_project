const express = require('express');
const mongoose = require('mongoose');

const app = express();
const PORT = process.env.PORT || 3000;

mongoose.connect('mongodb://localhost:27017/insurance', {
  useNewUrlParser: true,
  useUnifiedTopology: true
}).then(() => {
  console.log('Connected to MongoDB');
}).catch(err => {
  console.error('Failed to connect to MongoDB', err);
  process.exit(1);
});

const claimSchema = new mongoose.Schema({
  policyId: { type: mongoose.Schema.Types.ObjectId, ref: 'Policy' },
  description: String,
  status: { type: String, enum: ['Pending', 'Approved', 'Rejected'], default: 'Pending' }
});

const Claim = mongoose.model('Claim', claimSchema);

app.use(express.json());


app.post('/claim', async (req, res) => {
  try {
    const { policyId, description } = req.body;
    const claim = new Claim({ policyId, description });
    await claim.save();
    res.status(201).json(claim);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Server error' });
  }
});


app.get('/claims', async (req, res) => {
  try {
    const claims = await Claim.find();
    res.json(claims);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Server error' });
  }
});


app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});


