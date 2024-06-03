const mongoose = require('mongoose');

const ClaimSchema = new mongoose.Schema({
    user: {
        type: mongoose.Schema.Types.ObjectId,
        ref: 'user'
    },
    description: {
        type: String,
        required: true
    },
    photos: [{
        type: String 
    }],
    status: {
        type: String,
        default: 'Pending'
    },
    date: {
        type: Date,
        default: Date.now
    }
});

module.exports = Claim = mongoose.model('claim', ClaimSchema);
